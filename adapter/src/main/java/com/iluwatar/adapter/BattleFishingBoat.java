/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Da es sich um einen object based adapter handelt, verwendet er ein {@link FishingBoat}
 */
public class BattleFishingBoat implements BattleShip {

  private static final Logger LOGGER = LoggerFactory.getLogger(BattleFishingBoat.class);

<<<<<<< HEAD
  private FishingBoat fishingBoat;

  public BattleFishingBoat() {
    fishingBoat = new FishingBoat();
=======
  private FishingBoat boat;

  public BattleFishingBoat() {
    boat = new FishingBoat();
>>>>>>> 97304b4d8a86ddefc5e443aae632e35b1a6f4858
  }

  @Override
  public void fire() {
    LOGGER.info("fire!");
  }

  @Override
  public void move() {
<<<<<<< HEAD
    fishingBoat.sail();
=======
    boat.sail();
>>>>>>> 97304b4d8a86ddefc5e443aae632e35b1a6f4858
  }
}
