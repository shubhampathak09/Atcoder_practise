# -*- coding: utf-8 -*-
"""
Created on Thu Jan 26 20:14:12 2023

@author: shubham pathak
"""

import os
import random
import math
from pathlib import Path
from collections import Counter

#from tqdm import tqdm
import pandas as pd
import numpy as np
#import pyarrow.parquet as pq

import matplotlib.pyplot as plt
import seaborn as sns
import plotly.express as px
import plotly.graph_objects as go

sns.set_style("darkgrid")

data_path = Path(r"C:\Users\91954\Documents\Atcoder\Python\IceCube-Neutrios Deep in Ice\Data\sensor_geometry.csv")

sensor_geometry=pd.read_csv(data_path)

print(f"Shape: {sensor_geometry.shape}")

sensor_geometry.head(10)
