public class InstagramRunner{

        public static void main(String args[]){

        Instagram fb = new Instagram();

        fb.setUsername("Ganesh");
        System.out.println("User Name:"+fb.getUsername());

        fb.setNoOfFriends(100);
        System.out.println("Total Friends:"+fb.getNoOfFriends());

        fb.setNoOfPosts(0);
        System.out.println("Number of post is:"+fb.getNoOfPosts());

        fb.setAccountCreatedYear(2015);
        System.out.println(fb.getAccountCreatedYear());

        fb.setActiveStatus(true);
        System.out.println(fb.getActiveStatus());

        if(fb.getNoOfPosts() < 20){
		System.out.println("User Name:"+fb.getUsername());
		System.out.println("Number of post is:"+fb.getNoOfPosts());
        }else{
        System.out.println("No posts");       
        }
        if(fb.getUsername() == "Ganesh" && fb.getAccountCreatedYear() != 2016){
        System.out.println("User Name:"+fb.getUsername());
        System.out.println("Total Friends:"+fb.getNoOfFriends());
        System.out.println("Number of post is:"+fb.getNoOfPosts());
        System.out.println(fb.getAccountCreatedYear());
        System.out.println(fb.getActiveStatus());
        }else{
        System.out.println("Not found details");
        }

        }
}