import org.junit.*;;
public class calculadoratest {
    @Test
    public void Test(){
        //calculadora ca = new calculadora();
        Assert.assertEquals(8, calculadora.suma(3, 5));

    }
    
}
