import cv2
import numpy as np

# Load the image
image = cv2.imread('example_image.jpg')

# Resize the image while maintaining the aspect ratio
width = 600
height = int(image.shape[0] * width / image.shape[1])
image = cv2.resize(image, (width, height))

# Create a mask with the same shape as the image
mask = np.zeros(image.shape[:2], np.uint8)

# Define the background and foreground models
background_model = np.zeros((1, 65), np.float64)
foreground_model = np.zeros((1, 65), np.float64)

# Define the rectangular region of interest (ROI) for the foreground object
rect = (50, 50, width - 50, height - 50)

# Apply the GrabCut algorithm to the image
cv2.grabCut(image, mask, rect, background_model, foreground_model, 5, cv2.GC_INIT_WITH_RECT)

# Create a mask where the background pixels are marked as 0, and the foreground pixels are marked as 1 or 3
mask = np.where((mask == 2) | (mask == 0), 0, 1).astype('uint8')

# Apply the mask to the original image to remove the background
image = image * mask[:, :, np.newaxis]

# Display the image with the background removed
cv2.imshow('Background Removed Image', image)
cv2.waitKey(0)
cv2.destroyAllWindows()
