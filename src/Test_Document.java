package com.inheritance;

abstract class Document {

	String text;

	public Document() {
		text = "Document...";
		System.out.println("Document->def...");
	}

	public Document(String text) {
		super();
		this.text = text;
		System.out.println("Document->param...");
	}

	public void print() {
		System.out.println("Document->printing:" + text);
	}

	public abstract void open();

	public abstract void save();

	public abstract void close();
}

class Word extends Document {

	public Word() {
		super("Word...");
	}

	public Word(String ptext) {
		super(ptext);
	}

	@Override
	public void open() {
		System.out.println("openWord....");
	}

	@Override
	public void save() {
		System.out.println("saveWord...");
	}

	@Override
	public void close() {
		System.out.println("closeWord....");
	}

	public void addPage() {
		System.out.println("PageAdded....");
	}

}

class Excel extends Document {

	public Excel() {
		super("SuperExcel...");
	}

	public Excel(String ptext) {
		super(ptext);
	}

	@Override
	public void open() {
		System.out.println("openExcel....");
	}

	@Override
	public void save() {
		System.out.println("saveExcel...");
	}

	@Override
	public void close() {
		System.out.println("closeExcel....");
	}

	public void addSheet() {
		System.out.println("SheetAdded....");
	}

}

class PowerPoint extends Document {

	public PowerPoint() {
		super("PowerPoint...");
	}

	public PowerPoint(String ptext) {
		super(ptext);
	}

	@Override
	public void open() {
		System.out.println("openPowerPoint....");
	}

	@Override
	public void save() {
		System.out.println("savePowerPoint...");
	}

	@Override
	public void close() {
		System.out.println("closePowerPoint....");
	}

	public void addSlide() {
		System.out.println("SlideAdded....");
	}
}

class LaserPrinter{
	static int wordCount;
	static int excelCount;
	static int powerPointCount;
	static int documentCount;
	
	static void print(Word word)
	{
		System.out.println("Document Printing"+word.text);
		wordCount++;
	}
	static void print(Excel excel)
	{
		System.out.println("Document Printing"+excel.text);
		excelCount++;
	}
	static void print(PowerPoint powerPoint)
	{
		System.out.println("Document Printing"+powerPoint.text);
		powerPointCount++;
	}
	static void print(Document document)
	{
		System.out.println("Document Printing"+document.text);
		documentCount++;
		if(document instanceof Word)
		{
			wordCount++;
		}
	}
	
}

public class Test_Document
{
	public static void main(String[] args) {
//			Document document = new Word();
//			document.open();
//			document.save();
//			document.close();
//			document.print();
//			System.out.println("----------------------------");
//			Document documentExcel = new Excel();
//			documentExcel.open();
//			documentExcel.save();
//			documentExcel.close();
//			System.out.println("----------------------------");
//			Document documentPowerPoint = new PowerPoint();
//			documentPowerPoint.open();
//			documentPowerPoint.save();
//			documentPowerPoint.close();
		Word word = new Word();
		Excel excel = new Excel();
		PowerPoint powerPoint = new PowerPoint();
		Document docs[] = new Document[3];
		docs[0] = word;
		docs[1] = excel;
		docs[2] = powerPoint;
		
		LaserPrinter.print(word);
		LaserPrinter.print(excel);
		LaserPrinter.print(powerPoint);
		
		for(Document doc2:docs) {
			LaserPrinter.print(doc2);
		}
		
		System.out.println("Total Document Count:"+LaserPrinter.documentCount);
	}
}
	


