package com.javarush.test.level14.lesson06.home01;

/**
 * Created with IntelliJ IDEA.
 * User: Lesha
 * Date: 21.04.13
 * Time: 12:33
 * To change this template use File | Settings | File Templates.
 */
public class BelarusianHen extends Hen
{
    int N;
    String SSSSS = "Belarus";
    @Override
    int getCountOfEggsPerMonth()
    {
        return N;  //To change body of implemented methods use File | Settings | File Templates.
    }
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + SSSSS + ". Я несу " + N + " яиц в месяц.";
    }
}
