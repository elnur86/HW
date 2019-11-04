package hw.hw6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class familyTest
{
    family Family;
    ArrayList<human> famTest=new ArrayList<>();
    human h1=new human("Tom","Lyn",1980,100);
    human h2=new human("Julia","Onail",1983,120);
    human h3;

    @Before
    public void before() {
        Family=new family(famTest);
        this.famTest.add(h1);
        this.famTest.add(h2);
    }

    @Test
    public void addChild() {
        this.famTest.add(h1);
        Assert.assertEquals(3,famTest.size());
    }

    @Test
    public void deleteChild() {
        this.famTest.remove(h3);
        Assert.assertEquals(2, famTest.size());
        this.famTest.remove(h1);
        Assert.assertEquals(1,famTest.size());
    }

    @Test
    public void countFamily() {
    Assert.assertEquals(4,2+famTest.size());
    }
}
