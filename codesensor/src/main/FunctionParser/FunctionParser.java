package main.FunctionParser;

import main.CoarseFunctionParser.CoarseFunctionParser;
import main.FineFunctionParser.FineFunctionParser;
import main.codeitems.functionContent.CompoundItem;
import tools.index.CommonParser;
import tools.index.TokenSubStream;

public class FunctionParser
{
	CommonParser parser;

	public FunctionParser()
	{
		parser = new CoarseFunctionParser();
	}

	public void enableFineParsing()
	{
		parser = new FineFunctionParser();
	}
	
	public void disableFineParsing()
	{
		parser = new CoarseFunctionParser();
	}
	
	public void parseAndWalkStream(TokenSubStream tokens)
	{
		parser.parseAndWalkStream(tokens);
	}
	
	public void parseAndWalkString(String input)
	{
		parser.parseAndWalkString(input);
	}

	public CompoundItem getResult()
	{
		// The result is what's left on the stack in the end
		return parser.getResult();
	}
	
	
}
