package r.packages; 

import org.junit.Ignore;
import org.junit.Test;

public class AspectPackageTest extends PackageTest {
  
  @Test
  @Ignore("not yet working")
  public void simple() {
    
    eval("library('aspect')");
    eval("data('wurzer')");
    
    eval("res.cor <- corAspect(wurzer, aspect='aspectSum', level=c(rep('nominal',2), rep('ordinal',5), 'nominal'))");
    System.out.println( global.getVariable("res.cor") );    
  }
}