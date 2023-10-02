import torch
from torch.utils.data import DataLoader

def collate_fn(batch):
    # Get the maximum image size in the batch
    max_size = max([sample['image'].size(1) for sample in batch])
    
    # Initialize empty tensors for images and labels
    images = torch.zeros(len(batch), 3, max_size, max_size)
    labels = []
    
    # Iterate over the samples in the batch
    for i, sample in enumerate(batch):
        image = sample['image']
        label = sample['label']
        
        # Pad the image to the maximum size
        pad_size = max_size - image.size(1)
        padded_image = torch.nn.functional.pad(image, (0, pad_size, 0, pad_size))
        
        # Add the padded image and label to the batch tensors
        images[i] = padded_image
        labels.append(label)
    
    return {'image': images, 'label': labels}

# Create a dummy dataset and DataLoader
dataset = [{'image': torch.randn(3, 32, 32), 'label': 0},
           {'image': torch.randn(3, 28, 28), 'label': 1},
           {'image': torch.randn(3, 30, 30), 'label': 2}]
           
dataloader = DataLoader(dataset, batch_size=2, collate_fn=collate_fn)

# Iterate over the batches
for batch in dataloader:
    images = batch['image']
    labels = batch['label']
    
    # Perform your training or inference operations on the batch
    print(images.shape)
    print(labels)
