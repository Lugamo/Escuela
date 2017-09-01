package com.example.eduardo.escuela;

/**
 * Created by eduardo on 18/08/17.
 */

public	class	Output	{

    private	static	Output salida =	new Output();
    private	static	String	output;

    private	Output(){
    }

    public	static	Output getUser()	{
        return	salida;
    }

    public	static	String	getOutput()	{
        return	output;
    }

    public	static	void setOutput(String	o, String a, String e)	{
        output	=	o + "      " + a + " " + "      "+ e;
    }
}

