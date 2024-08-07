public class InstagramRunner{

        public static void main(String args[]){

        Instagram insta = new Instagram();

        insta.setUsername("Ganesh");
        System.out.println("User Name:"+insta.getUsername());

        insta.setNoOfFriends(100);
        System.out.println("Total Friends:"+insta.getNoOfFriends());

        insta.setNoOfPosts(0);
        System.out.println("Number of post is:"+insta.getNoOfPosts());

        insta.setAccountCreatedYear(2015);
        System.out.println(insta.getAccountCreatedYear());

        insta.setActiveStatus(true);
        System.out.println(insta.getActiveStatus());

        if(insta.getNoOfPosts() < 20){
		System.out.println("User Name:"+insta.getUsername());
		System.out.println("Number of post is:"+insta.getNoOfPosts());
        }else{
        System.out.println("No posts");       
        }
        if(insta.getUsername() == "Ganesh" && insta.getAccountCreatedYear() != 2016){
        System.out.println("User Name:"+insta.getUsername());
        System.out.println("Total Friends:"+insta.getNoOfFriends());
        System.out.println("Number of post is:"+insta.getNoOfPosts());
        System.out.println(insta.getAccountCreatedYear());
        System.out.println(insta.getActiveStatus());
        }else{
        System.out.println("Not found details");
        }

        }
}