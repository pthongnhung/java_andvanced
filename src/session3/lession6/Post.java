package session3.lession6;

import java.util.List;

    public class Post {
        private String title;
        private List<String> tags;

        public Post(String title, List<String> tags) {
            this.title = title;
            this.tags = tags;
        }

        public List<String> getTags() {
            return tags;
        }
    }

