/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Ali Marafa
 */


public interface bonjour extends Remote {
   String ditbonjour() throws 
   RemoteException;
        }
