package za.co.multichoice.pathfinder.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import za.co.multichoice.pathfinder.AbstractNode;
import za.co.multichoice.pathfinder.Map;
import za.co.multichoice.pathfinder.NodeFactory;
import za.co.multichoice.pathfinder.NodeFactoryImpl;

public class NodeFactoryTest extends TestCase {

	public void testGetNodeAt() {
		Map map;
		try {
			NodeFactory nodeFactory = new NodeFactoryImpl();
			map = new Map(nodeFactory);
			AbstractNode startNode = nodeFactory.createNode(0,0,'0');
			map.setNode(startNode);
			AbstractNode nextNode = nodeFactory.createNode(0,1,'1');
			map.setNode(nextNode);
			assertEquals(1, map.getNodes().size());			
			assertEquals(2, (((ArrayList) map.getNodes().get(0))).size());
			
			AbstractNode node = map.getNode(0, 1);
			assertEquals(0, node.getxPosition());
			assertEquals(1, node.getyPosition());
		} catch (Exception ex) {
			fail (ex.getMessage());
		}
	}
	
	public void testUniqueStartNode() {
		Map map;
		try {
			NodeFactory nodeFactory = new NodeFactoryImpl();
			map = new Map(nodeFactory);
			AbstractNode startNode = nodeFactory.createNode(0,0,'@');
			map.setNode(startNode);
			assertTrue(map.getNodes().size() > 0);
			
			AbstractNode nextNode = nodeFactory.createNode(0,1,'@');  
			map.setNode(nextNode); // should throw exception

		} catch (Exception ex) {
			// failed as expected
		}
	}

}
