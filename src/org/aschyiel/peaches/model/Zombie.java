//..model/Zombie.java, uly, june2013..
package org.aschyiel.peaches.model;

/**
* A zombie is an entity composed of the following high-level characteristics:
* positioning, hunger, and a hunting-strategy.
*/
public class Zombie
{
  public Zombie( ZombieType type, String id )
  {
    this.type = type;
    this.id = id;
  }

  /** An identifier for this zombie. */
  public final String id;

  /**
  * The type of zombie, suggests how to render it,
  * and provides a hunting-strategy based on the type.
  */
  public final ZombieType type;

  /**
  * Get the hunting-strategy type for this zombie,
  * used to determine how this zombie operates/moves/etc.
  */
  public HuntingStrategyType getHuntingStrategyType()
  {
    return this.type.huntingStrategyType;
  }

}