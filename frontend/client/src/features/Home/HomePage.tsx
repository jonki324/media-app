import React from 'react';
import { Link as RouterLink } from 'react-router-dom';
import {
  Typography,
  Grid,
  Card,
  CardContent,
  CardActions,
  Button,
  Link,
  Stack,
  CardHeader,
  Avatar,
  Chip,
  TextField,
  IconButton,
  Box,
} from '@mui/material';
import { Image, Label, Search } from '@mui/icons-material';
import Layout from '../../components/Layout/Layout';

const HomePage: React.FC = () => {
  return (
    <Layout>
      <Grid container justifyContent="center" pt={1} spacing={1}>
        <Grid item xs={12}>
          <Card>
            <CardContent>
              <Typography variant="h3">Home Page Title</Typography>
              <Typography variant="body1">Application Description</Typography>
            </CardContent>
            <CardActions>
              <Button>
                <Link component={RouterLink} to="/about" underline="none">
                  About
                </Link>
              </Button>
            </CardActions>
          </Card>
        </Grid>

        <Grid item xs={12} md={9}>
          <Stack spacing={1}>
            <Card>
              <Grid container>
                <Grid item xs={9}>
                  <CardHeader
                    avatar={
                      <Avatar>
                        <Image />
                      </Avatar>
                    }
                    title="Author Name"
                    subheader="2021-11-22"
                  />
                  <CardContent>
                    <Typography variant="h5">Sample Title</Typography>
                    <Typography variant="body2">Sample Description Body</Typography>
                    <Stack direction="row" spacing={1} mt={2}>
                      <Chip icon={<Label />} size="small" label="Sample Tag1" />
                      <Chip icon={<Label />} size="small" label="Sample Tag2" />
                    </Stack>
                  </CardContent>
                </Grid>
                <Grid item xs={3}>
                  <Image sx={{ width: '100%', height: '100%' }} />
                </Grid>
              </Grid>
            </Card>
            <Card>
              <Grid container>
                <Grid item xs={9}>
                  <CardHeader
                    avatar={
                      <Avatar>
                        <Image />
                      </Avatar>
                    }
                    title="Author Name"
                    subheader="2021-11-22"
                  />
                  <CardContent>
                    <Typography variant="h5">Sample Title</Typography>
                    <Typography variant="body2">Sample Description Body</Typography>
                    <Stack direction="row" spacing={1} mt={2}>
                      <Chip icon={<Label />} size="small" label="Sample Tag1" />
                      <Chip icon={<Label />} size="small" label="Sample Tag2" />
                    </Stack>
                  </CardContent>
                </Grid>
                <Grid item xs={3}>
                  <Image sx={{ width: '100%', height: '100%' }} />
                </Grid>
              </Grid>
            </Card>
          </Stack>
        </Grid>
        <Grid item display={{ xs: 'none', md: 'block' }} md={3}>
          <Box sx={{ display: 'flex' }}>
            <TextField id="search" label="Search" variant="outlined" fullWidth />
            <IconButton>
              <Search />
            </IconButton>
          </Box>
          <Stack direction="row" spacing={1} mt={2}>
            <Chip icon={<Label />} size="small" label="Sample Tag1" />
            <Chip icon={<Label />} size="small" label="Sample Tag2" />
          </Stack>
        </Grid>
      </Grid>
    </Layout>
  );
};

export default HomePage;
