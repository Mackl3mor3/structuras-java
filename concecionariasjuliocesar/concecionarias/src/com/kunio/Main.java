package com.kunio;

import com.kunio.model.Cliente;

public class Main {
    public static void main(String[] args) {

        System.out.println("ejecutar uno por uno ");

        //CLIENTES


        Cliente cliente = new Cliente("2547","Lucas pukas", "Oruro", "Av.santacruz s/n", 4669621);


        Cliente Carlos = new Cliente("2548","Lucas pukas", "Oruro", "Av.chulo s/n", 498889621);

        Cliente Lorena = new Cliente("4561-l","Lore", "Pando", "Av.circuns", 4988511);

        Cliente Luis = new Cliente("74535","Luigi", "sucre", "Av. cuho", 44482136);

        Cliente Pablo = new Cliente("423412","Pablo", "cocha", "Av. America", 440128710);

        Cliente Victor = new Cliente("423841-k","victor", "tarija", "Av. 6 de agosto 45", 4451471);

        Cliente Vianka = new Cliente("05342","bianka", "la paz", "Av. Santacruz", 44495120);

        Cliente Fernando = new Cliente("23254","julia Rojas", "Chuquizaca", "Av.trolera", 44047120);


        //CRUD tabla cliente

        //ClienteDao clienteDao = new ClienteDao();


        //CREATE



       /* ClienteDao clienteDao = new ClienteDao();



        clienteDao.addCliente(Carlos);


        clienteDao.addCliente(Lorena);


        clienteDao.addCliente(Luis);


        clienteDao.addCliente(Pablo);


        clienteDao.addCliente(Victor);


        clienteDao.addCliente(Vianka);


        clienteDao.addCliente(Fernando);*/

        //READ
        /*List<Cliente> clientes = clienteDao.getAllCliente();

        for (int i = 0; i < clientes.size(); i++) {

            Cliente cliente = clientes.get(i);

            System.out.println(cliente);

        }*/

        //UPDATE

        /*Cliente cliente = new Cliente("2547","Rodrigo Torres", "Oruro", "Av.6 de Agosto", 44514512);

        clienteDao.updateCLiente(cliente);


        //DELETE
        clienteDao.deleteCLiente("2547");

        clienteDao.deleteCLiente("7845");*/


        //COCHES

        /*Coche coche = new Coche("15JU", "SUSUKI", "2000", "BLANCO", 10.000, new Cliente());

        Coche SUSUKI = new Coche("15GT", "SUSUKI", "2000", "BLANCO", 10.000, new Cliente());

        Coche TOYOTA = new Coche("78K8", "TOYOTA", "precio", "AZUL", 12.000, new Cliente());

        Coche WOLSVAGEN = new Coche("2HJK", "WOLSVAGEN", "precio", "AMARILLO", 10.500, new Cliente());

        Coche YAMAHA = new Coche("65GT", "YAMAHA", "precio", "PLOMO", 13.000, new Cliente());

        Coche FERRARI = new Coche("89H6", "FERRARI", "precio", "ROJO", 50.000, new Cliente());

        Coche FERRARIBLACK = new Coche("00H0", "FERRARIBLACK", "NEGRO", "f", 60.000, new Cliente());*/


        //CRUD tabla cliente

       //CocheDao cocheDao = new CocheDao();


        //CREATE

        /*CocheDao cocheDao = new CocheDao();


        cocheDao.addCoche(coche);

        cocheDao.addCoche(coche);

        cocheDao.addCoche(SUSUKI);

        cocheDao.addCoche(TOYOTA);

        cocheDao.addCoche(WOLSVAGEN);

        cocheDao.addCoche(YAMAHA);

        cocheDao.addCoche(FERRARI);

        cocheDao.addCoche(FERRARIBLACK);*/


        //READ

        /*List<Coche> coches = cocheDao.getAllCoche();

        for (int i = 0; i < coches.size(); i++) {


            Coche coche = coches.get(i);


            System.out.println(coche);

        }*/


        //UPDATE

        /*Coche coche = new Coche("15GT", "SUSUKI", "2000", "BLANCO", 10.000, new Cliente());

        cocheDao.updteCoche(coche);


        //DELETE

        cocheDao.deleteCoche("15GT");

        cocheDao.deleteCoche("89h6");*/


//-------------------------------------------------------------------------------------------------------------------
        //REVISION

        /*Revision revision1 = new Revision("1558H", "SI", "NO", "NULL", new Coche());

        Revision revision2 = new Revision("48K5", "NO", "SI", "SI", new Coche());

        Revision revision3 = new Revision("00K0", "NO", "NO", "NULL", new Coche());

        Revision revision5 = new Revision("15K8", "NO", "SI", "NO", new Coche());

        Revision revision6 = new Revision("03KI", "SI", "NO", "NO", new Coche());

        Revision revision7 = new Revision("LO56", "SI", "NO", "SI", new Coche());*/


        //CRUD tabla cliente

        //RevisionDao revisionDao = new RevisionDao();


        //CREATE
        /*RevisionDao revisionDao = new RevisionDao();

        revisionDao.addRevision(revision1);

        revisionDao.addRevision(revision2);

        revisionDao.addRevision(revision3);

        revisionDao.addRevision(revision4);


        revisionDao.addRevision(revision5);

        revisionDao.addRevision(revision6);

        revisionDao.addRevision(revision7);*/



        //READ
        /*List<Revision> revisions = revisionDao.getAllRevision();

        for (int i = 0; i < revisions.size(); i++) {

            Revision revision =revisions.get(i);

            System.out.println(revision);

        }*/

        //UPDATE


        /*Revision revision1 = new Revision ("1558H", "SI", "NO", "NULL", new Coche());

        revisionDao.updateRevision(revision1);


        //DELETE

        revisionDao.deleteRevision("15554358y");

        revisionDao.deleteRevision("0545I");*/

    }
}
