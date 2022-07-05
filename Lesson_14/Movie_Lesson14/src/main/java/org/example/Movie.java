package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {
    private int id;
    private String title;
    private String[] category;
    private String director;
    private int length;
    private Date release;
    private int view;

    @Override
    public String toString() {
        return id + " - " + title + " - " + Arrays.toString(category) + " - " + director + " - "
                + length + " - " + Util.formatDate(release) + " - " + view;
    }
}
