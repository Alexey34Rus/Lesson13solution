package ru.spiridonov.springcourse.genre;

import org.springframework.stereotype.Component;
import ru.spiridonov.springcourse.Music;

/**
 * @author Neil Alishev
 */

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
