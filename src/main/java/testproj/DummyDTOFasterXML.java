package testproj;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * Created by mohit.chugh on 2/22/16.
 */

public class DummyDTOFasterXML {
    public static class Child {
        public static class GrandChild {
            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            private String subject;
        }
        private String email;
        @JsonUnwrapped
        private GrandChild grandChild;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public GrandChild getGrandChild() {
            return grandChild;
        }

        public void setGrandChild(GrandChild grandChild) {
            this.grandChild = grandChild;
        }
    }
    private String login;

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @JsonUnwrapped
    private Child child;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
