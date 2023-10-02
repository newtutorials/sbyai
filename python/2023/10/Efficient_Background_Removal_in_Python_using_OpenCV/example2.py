import cv2

# Load the image
image = cv2.imread('example_image.jpg')

# Display the image
cv2.imshow('Original Image', image)
cv2.waitKey(0)
cv2.destroyAllWindows()
