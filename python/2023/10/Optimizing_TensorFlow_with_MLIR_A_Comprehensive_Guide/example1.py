import tensorflow as tf
from tensorflow.compiler.mlir.tensorflow.backend.tensorflow_mlir_converter import convert

# Define a TensorFlow graph
x = tf.constant([1, 2, 3])
y = tf.constant([4, 5, 6])
z = tf.add(x, y)

# Lower the TensorFlow graph to MLIR
mlir_module = convert([z])

# Print the MLIR module
print(mlir_module)
