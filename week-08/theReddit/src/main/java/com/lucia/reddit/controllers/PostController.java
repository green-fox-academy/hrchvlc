package com.lucia.reddit.controllers;

import com.lucia.reddit.models.Post;
import com.lucia.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
    private PostRepository postRepository;

    @Autowired
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("posts", this.postRepository.findAll());
        return "index";
    }

    @GetMapping("/submit")
    public String submit() {
        return "submit";
    }

    @PostMapping("/submit")
    public String post(Model model, @RequestParam String title, @RequestParam String url) {
        model.addAttribute("title", title);
        model.addAttribute("url", url);
        model.addAttribute("totalVotes", 0);
        postRepository.save(new Post(title, url, 0));
        return "redirect:/";
    }
    @PostMapping
    public String upvote(Post post) {
        post.upvote();
        return "index";
    }
    @PostMapping
    public String downvote(Post post, int newTotal) {
        newTotal = post.getTotalVotes() + 1;

        return "index";
    }
}
