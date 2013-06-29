//..model/Tile.java, uly, june2013..
package org.aschyiel.peaches.model;

/**
* A tile describes a small section of the game world.
* Tiles connect to each other to form a graph - to represent, say a room.
*/
public class Tile
{
  public Tile( TileType type, String id )
  {
    this.type = type;
    this.id = id;
  }

  /**
  * The identifier for this tile, ie 1-32.
  */
  public final String id;

  /**
  * What kind of tile are we representing within our world.
  */
  public final TileType type;

  public Tile left;
  public Tile right;
  public Tile up;
  public Tile down;


}