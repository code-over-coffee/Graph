package org.codeocoffee.graph.core

import scala.reflect.runtime.universe.TypeTag

abstract class GraphFrame[vertexType: TypeTag, edgeType: TypeTag] {

  def size: Int

  def isEmpty: Boolean

  def numVertices: Int

  def numEdges: Int

  def getAllVertices: collection.Set[vertexType]

  def getAllEdges: List[edgeType]

  def areAdjacent(v1: vertexType, v2: vertexType): Boolean

  def insertVertex(vertex: vertexType)

  def insertEdge(edge: edgeType, sourceVertex: vertexType, destinationVertex: vertexType)

  def deleteVertex(vertex: vertexType)

  def deleteEdge(edge: edgeType, sourceVertex: vertexType, destinationVertex: vertexType)

}
