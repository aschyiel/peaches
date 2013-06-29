//..model/TileType.java, uly, june2013..
package org.aschyiel.peaches.model;

/**
* The available types of tiles found within the game-world.
* Anything goes, pretty much.
*
* @see Tile
*/
public enum TileType {
  GRASS ( 1 )
, ROCK  ( 1 )
, DIRT  ( 2 )
, FLOOR ( 3 )
, BATHROOM_FLOOR ( 3 )
, ETC ( 1 );

  /** How noise resonates within this type. */
  public final Number NOISINESS;

  TileType( Number noisiness )
  {
    this.NOISINESS = noisiness;
  }
}