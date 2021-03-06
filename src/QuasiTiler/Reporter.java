/*
*				Reporter.java
*
*  Copyright (c) 1994 by Eugenio Durand and The Geometry Center.
*  Distributed under the terms of the GNU General Public License.
*
*  Java conversion copyright ( c ) 1999 by Pierre Baillargeon.
*/

package QuasiTiler;

public interface Reporter {
    public void report_point(Tiling tiling, int[] point);
}
