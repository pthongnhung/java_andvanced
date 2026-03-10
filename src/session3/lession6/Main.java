package session3.lession6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Post> posts = Arrays.asList(
                new Post("Java", Arrays.asList("java", "backend")),
                new Post("Python", Arrays.asList("python", "data"))
        );

        List<String> allTags = posts.stream()
                .flatMap(post -> post.getTags().stream())
                .collect(Collectors.toList());

        System.out.println(allTags);
    }
}