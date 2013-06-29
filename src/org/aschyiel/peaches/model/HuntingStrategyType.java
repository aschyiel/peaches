//..model/HuntingStrategyType.java, uly, june2013..
package org.aschyiel.peaches.model;

/**
* The various types of hunting strategies that are made available to zombies.
* Based on the type, we can provide each zombie with the appropriate AI/Strategy.
*/
public enum HuntingStrategyType
{
  /** The zombie will just sit there. */
  NONE,

  /** The zombie will move around more-or-less randomly. */
  BASIC;
}