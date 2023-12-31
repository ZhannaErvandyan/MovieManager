import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;

public class MovieManagerTest {

    @Test
    public void Test() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test2() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        String[] actual = manager.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test3() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7", "Film8", "Film9", "Film10"};
        String[] actual = manager.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test4() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test5() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");
        manager.addFilm("Film11");

        String[] expected = {"Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test6() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
