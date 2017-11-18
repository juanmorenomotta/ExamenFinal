package pregunta2;

public enum SharerType {
    Facebook {
        public String toString() {
            return "Facebook";
        }
    },
    Twitter {
        public String toString() {
            return "Twitter";
        }
    },
    Pinterest {
        public String toString() {
            return "Pinteres";
        }
    },
    Reddit {
        public String toString() {
            return "Reddit";
        }
    }
}
