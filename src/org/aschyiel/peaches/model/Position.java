//..model/Position.java, uly, june2013..
package org.aschyiel.peaches.model;

/**
* Positioning information within the game-world for a game-object.
* Includes, x-, y- coordinates, orientation, etc.
*
* Positions and their properties are immutable as a precaution against
* side-effects.
*/
public class Position
{
  /**
  * The basic 2d constructor.
  *
  * @public
  * @constructor
  * @param (int) x is the x-coordinate.
  * @param (int) y is the y-coodinate.
  * @param (int) angle (in degrees) describes which way the game-object
  *        is looking (aka yaw).
  * @return (Position)
  */
  public Position( int x, int y, int angle )
  {
    this.x     = x;
    this.y     = y;
    this.z     = 0;
    this.roll  = 0;
    this.pitch = 0;
    this.yaw   = angle;
  }

  //
  // Later we might want to simplify the 2d constructor by overloading
  // the 3rd parameter as a direction something like north, south, west,
  // east or some such.
  // -uly, 290613.
  //

  /**
  * The x-coodinate.
  */
  public final int x;

  /**
  * The y-coodinate.
  */
  public final int y;

  /**
  * The z-coodinate, reserves the possibility of going 3d.
  */
  public final int z;

  /**
  * Spin along the other (x) axis.
  * Probably not useful for this game,
  * but it would be cool for implementing "flipping" zombies as they get shot
  * and go spinning backwards as they fall.
  */
  public final int roll;

  /**
  * Spin along the y axis (ie. up/down).
  */
  public final int pitch;

  /**
  * Spin along the z axis (ie. left/right).
  */
  public final int yaw;
}