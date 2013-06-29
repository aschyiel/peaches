//..controller/Move.java, uly, june2013..
package org.aschyiel.peaches.controller;

import org.aschyiel.peaches.model.Modifier;
import org.aschyiel.peaches.model.Position;

/**
* This interface describes a legal "move" within the game world;
* On each turn, game objects select their next move in the game, ie:
* Go here, kill that, open this, etc.
*
* In a way, they're kind of like messages.
*/
public interface Move
{
  /**
  * Execute a game-object's move and calculate the result of this action.
  * Does NOT directly modify the game-object making the move (leaves room for
  * additional modifiers, like invincibility, etc. ).
  *
  * @param (Position) targetPosition is where the game-object is
  *         positioned before making their move.
  * @return (Modifier) The proposed game-object changes as a result of
  *         this turn's move.
  */
  Modifier move( Position targetPosition );
}