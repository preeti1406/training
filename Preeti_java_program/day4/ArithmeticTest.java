import java.io.*;
import java.util.*;
import junit.framework.TestCase;
public class ArithmeticTest extends TestCase
{
public ArithmeticTest()
{
}
public void testAdd()
{
Arithmetic a=new Arithmetic();
assertTrue(2==a.add(1,1));
}
}