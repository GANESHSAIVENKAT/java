public class Facebook{

        private String user_name;
        private int no_of_friends;
        private int no_of_posts;
        private int account_created_year;
        private boolean isAccount_active;

        public Facebook(){
        System.out.println("Facebook Details:");
        }
        public Facebook(String user_name,int no_of_friends, int no_of_posts,int account_created_year, boolean isAccount_active){
        this.user_name = user_name;
        this.no_of_friends = no_of_friends;
        this.no_of_posts = no_of_posts;
        this.account_created_year = account_created_year;
        this.isAccount_active = isAccount_active;
        }

        public void setUsername(String user_name){
        this.user_name = user_name;
        }
        public String getUsername(){
        return this.user_name;
        }

        public void setNoOfFriends(int no_of_friends){
        this.no_of_friends = no_of_friends;
        }
        public int getNoOfFriends(){
        return this.no_of_friends;
        }

        public void setNoOfPosts(int no_of_posts){
        this.no_of_posts = no_of_posts;
        }
        public int getNoOfPosts(){
        return this.no_of_posts;
        }

        public void setAccountCreatedYear(int account_created_year){
        this.account_created_year = account_created_year;
        }
        public int getAccountCreatedYear(){
        return account_created_year;
        }

        public void setActiveStatus(boolean isAccount_active){
        this.isAccount_active = isAccount_active;
        }
        public boolean getActiveStatus(){
        return this.isAccount_active;
        }

}