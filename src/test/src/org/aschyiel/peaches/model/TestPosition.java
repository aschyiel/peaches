//..model/PositionTest.java, uly, june2013..
package org.aschyiel.peaches.model;

import org.aschyiel.peaches.model.Position;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestPosition {

  private Position position2d;
  private int x;
  private int y;
  private int angle;

  @Before
  public void setUp()
  {
    x        = 1;
    y        = 2;
    angle    = 3;
    position2d = new Position( x, y, angle );
  }

  /**
  * Let's just trust me when I say that positions are supposed to be immutable...
  *
  * @see http://stackoverflow.com/questions/203475/how-do-i-identify-immutable-objects-in-java
  */
  @Test
  public void xProperty___shouldBeImmutable()
  {
    Assert.assertEquals( x, position2d.x );
  }

  @Test
  public void yProperty___shouldBeImmutable()
  {
    Assert.assertEquals( y, position2d.y );
  }

  @Test
  public void yawProperty___shouldBeImmutable()
  {
    Assert.assertEquals( angle, position2d.yaw );
  }
}