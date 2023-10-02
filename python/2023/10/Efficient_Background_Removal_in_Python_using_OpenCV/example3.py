import cv2

# Load the image
image = cv2.imread('example_image.jpg')

# Resize the image while maintaining the aspect ratio
width = 600
height = int(image.shape[0] * width / image.shape[1])
image = cv2.resize(image, (width, height))

# Display the resized image
cv2.imshow('Resized Image', image)
cv2.waitKey(0)
cv2.destroyAllWindows()
