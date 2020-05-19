/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editdelete;

import Data.DataPerpus;

/**
 *
 * @author Orenji
 */
public class EditdeleteMVC {
    
    DataPerpus dp;
    
    public EditdeleteMVC(DataPerpus dp) {
        this.dp = dp;
        EditdeleteView ev = new EditdeleteView();
        EditdeleteModel em = new EditdeleteModel();
        EditdeleteController ec = new EditdeleteController(ev,em,dp);
        
    }
}
