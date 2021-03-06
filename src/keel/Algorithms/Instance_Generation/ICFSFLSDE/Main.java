/***********************************************************************

	This file is part of KEEL-software, the Data Mining tool for regression, 
	classification, clustering, pattern mining and so on.

	Copyright (C) 2004-2010
	
	F. Herrera (herrera@decsai.ugr.es)
    L. Sánchez (luciano@uniovi.es)
    J. Alcalá-Fdez (jalcala@decsai.ugr.es)
    S. García (sglopez@ujaen.es)
    A. Fernández (alberto.fernandez@ujaen.es)
    J. Luengo (julianlm@decsai.ugr.es)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see http://www.gnu.org/licenses/
  
**********************************************************************/

//
//  Main.java
//
//  Salvador García López
//
//  Created by Salvador García López 3-10-2005.
//  Copyright (c) 2004 __MyCompanyName__. All rights reserved.
//

package keel.Algorithms.Instance_Generation.ICFSFLSDE;
/**Main class
 * 
 * @author Salvador García López
 */
public class Main {

    /** Main Function.
     * 
     * @param args main args. Configuration filename is needed.
     */
  public static void main (String args[]) {

    ICFSFLSDE ssma;

    if (args.length != 1)
      System.err.println("Error. A parameter is only needed.");
    else {
      ssma = new ICFSFLSDE (args[0]);
      ssma.Script = args[0];
      ssma.ejecutar();
    }
  }
}
