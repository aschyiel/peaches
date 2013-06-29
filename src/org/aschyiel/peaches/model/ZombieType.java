//..model/ZombieType.java, uly, june2013..
package org.aschyiel.peaches.model;

import org.aschyiel.peaches.model.HuntingStrategyType;

/**
* All the types of zombies that are available within the game.
* Fast zombies, slow zombies, wheel-chair zombies, you name it, it's here.
*
* @see org.aschyiel.peaches.model.Zombie
*/
public enum ZombieType
{
  SLOW ( HuntingStrategyType.BASIC ),
  FAST ( HuntingStrategyType.BASIC ),
  WHEEL_CHAIR ( HuntingStrategyType.NONE );

  ZombieType( HuntingStrategyType huntingStrategyType )
  {
    this.huntingStrategyType = huntingStrategyType;
  }

  /** This describes the movement behavior for this zombie-type. */
  public final HuntingStrategyType huntingStrategyType;
}