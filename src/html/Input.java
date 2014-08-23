/*
 * This file is part of TILT.
 *
 *  TILT is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  TILT is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with TILT.  If not, see <http://www.gnu.org/licenses/>.
 */

package html;

/**
 * Represent a simple input element
 * @author desmond
 */
public class Input extends Element
{
    /**
     * Create an input element in a form
     * @param id its id
     * @param type its type
     * @param value its initial value
     * @param enabled true if it is be created enabled
     */
    public Input( String id, String type,String value,boolean enabled )
    {
        super("input");
        addAttribute("id",id);
        addAttribute("type",type);
        addAttribute("value",value);
        if ( !enabled )
            addAttribute("disabled","");
    }
}
