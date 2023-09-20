package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate newDay = new FormDate();

        newDay.day=31;
        newDay.month= 12;
        newDay.year = 1997;

        post.birthday = newDay;
        post.name="Elvina";
        post.surname="Krivileva";
        post.patronymic="Edyardovna";
        post.passport="1001 101009";
        post.phone="+79053548090";
        boolean subscription = true;

    }
}