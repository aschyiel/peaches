//..controller/HuntingStrategy.java, uly, june2013..
package org.aschyiel.peaches.controller;

import org.aschyiel.peaches.controller.Move;
import org.aschyiel.peaches.model.Position;

/**
* A hunting-strategy describes how a zombie moves and thinks within the game.
*/
public interface HuntingStrategy
{
  /**
  * Based on the available environmental information,
  * tell the zombie to do something.
  *
  * @param (Position) targetPosition for where the zombie wants to be at.
  *                   Usually where a player is, but this might be different
  *                   if there are 2+ players, or if the zombie is playing
  *                   follow-the-leader.
  * @param (Position) zombiePosition for where the zombie currently is (used to
  *                   calculate distance to it's target, etc.).
  * @param (Move[]) availableMoves that the zombie gets to choose from.
  * @return (Move) The zombie AI's next-move.
  */
  Move hunt( Position targetPosition,
             Position zombiePosition,
             Move[] availableMoves );
}
