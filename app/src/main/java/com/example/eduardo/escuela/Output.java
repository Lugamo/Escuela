package com.example.eduardo.escuela;

/**
 * Created by eduardo on 18/08/17.
 */

public	class	Output	{
    private	static	String	output;

    public	static	String	getOutput()	{
        return	output;
    }

    public	static	void setOutput(String	o, String a, String e)	{
        output	=	o + "      " + a + " " + "      "+ e;
    }
}
