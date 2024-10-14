/************
 * Comp 346 Assignment 2
 * Winter 2024
 * Concordia University
 * Miskat Mahmud 40250110
 * Ryan Mazari 40241379
 * Date: 14/03/2024
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Network objNetwork = new Network( );            /* Activate the network */
        objNetwork.start();

        Client objClient1 = new Client("sending");          /* Start the sending client thread */
        objClient1.start();
        Client objClient2 = new Client("receiving");        /* Start the receiving client thread */
        objClient2.start();

        Server server1 = new Server("serverthread1");
        Server server2 = new Server("serverthread2");

        Server server3 = new Server("serverthread3");

        server1.start();
        server2.start();
        server3.start();




        /*..............................................................................................................................................................*/

    }

}
