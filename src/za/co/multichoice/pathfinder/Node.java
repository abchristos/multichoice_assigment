package za.co.multichoice.pathfinder;

/**
 * An implementation of a Node:
 *  overriding the setFutureCosts method using Manhattan method
 *  and adding weighted symbol attribute
 */
public class Node extends AbstractNode {
	   
		/**
		 * @param xPosition
		 * @param yPosition
		 * @param terrainSymbol
		 */
		public Node(int xPosition, int yPosition, char terrainSymbol) {
            super(xPosition, yPosition, terrainSymbol);
        }

        /* (non-Javadoc)
         * @see pathfinding.AbstractNode#setFuturePathCosts(pathfinding.AbstractNode)
         */
        public void setFuturePathCosts(AbstractNode endNode) {
            this.setFuturePathCosts((Math.abs(this.getxPosition() - endNode.getxPosition())
                    + Math.abs(this.getyPosition() - endNode.getyPosition())));
        }

}
