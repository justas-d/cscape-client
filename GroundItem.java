// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

final class GroundItem extends Animable {

	public final Model getRotatedModel()
	{
		ItemDef itemDef = ItemDef.forID(Id);
			return itemDef.getModel(Amount);
	}

	public GroundItem()
	{
	}

	public int Id;
	public int x;
	public int y;
	public int Amount;
}
