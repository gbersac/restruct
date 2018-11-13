package io.github.methrat0n.restruct.readers.bson

import reactivemongo.bson.{ BSONReader, BSONValue }
import io.github.methrat0n.restruct.core.Program
import io.github.methrat0n.restruct.core.data.schema.ComplexSchemaAlgebra

object BsonReaderInterpreter extends SimpleBsonReaderInterpreter with ComplexBsonReaderInterpreter with FieldBsonReaderInterpreter {
  def run[T](program: Program[ComplexSchemaAlgebra, T]): BSONReader[BSONValue, T] = program.run(this)
}