/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juliana.cct.oodp;

import java.io.IOException;
import static juliana.cct.oodp.EntryPoint.bufferedReader;

/**
 *
 * @author Juliana_Sousa <juliana.oli.sousa@gmail.com>
 */
class Helper {
    public static void pause() throws IOException{
        System.out.println("\nPress any key to continue...\n");
        bufferedReader.readLine();
    }
}
