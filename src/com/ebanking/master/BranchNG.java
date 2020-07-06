package com.ebanking.master;

import org.testng.annotations.Test;

public class BranchNG extends Base{
	
	
	public void Branche () throws InterruptedException
	{
		Lb.BranchCreation("Chiswick", "CrossWest", "23234", "UK", "England","LONDON");
	}
	
}
