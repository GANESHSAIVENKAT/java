public class AnimeRunner{
public static void main(String[] args){
Animes anime = new Animes();
int length = anime.getlength();
		System.out.println("length is:"+length);
		anime.createbyAnimename("DemonSlayer");
		anime.createbyAnimename("Bleach");
		anime.createbyAnimename("Onepiece");
		anime.createbyAnimename("Naruto");
		anime.createbyAnimename("DeathNote");
		anime.animereadby();
		System.out.println("----------update--------");
		anime.animeupdateby("Naruto","MyheroAcadamy");
		anime.animereadby();
		System.out.println("----------delete--------");
		anime.animedeleteby("MyheroAcadamy");
		anime.animereadby();
		System.out.println("----------search--------");
		String animes = anime.searchByAnimeNames("DemonSlayer");
		System.out.println(animes);
		anime.animereadby();
 }
}
