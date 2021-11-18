import React from 'react';
import { Card, CardContent, Grid, Button, TextField } from '@mui/material';
import { AccountCircleTwoTone } from '@mui/icons-material';
import Layout from '../../components/Layout/Layout';

const LoginPage: React.FC = () => {
  return (
    <Layout>
      <Grid container justifyContent="center" alignItems="center" sx={{ height: '100%' }}>
        <Grid item>
          <Card raised sx={{ width: 350 }}>
            <CardContent>
              <Grid container spacing={3}>
                <Grid item xs={12} textAlign="center">
                  <AccountCircleTwoTone sx={{ fontSize: 70 }} />
                </Grid>
                <Grid item xs={12}>
                  <TextField id="loginId" label="Login ID" variant="outlined" fullWidth />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    type="password"
                    id="password"
                    label="Password"
                    variant="outlined"
                    fullWidth
                  />
                </Grid>
                <Grid item xs={12}>
                  <Button variant="contained" fullWidth>
                    LOGIN
                  </Button>
                </Grid>
              </Grid>
            </CardContent>
          </Card>
        </Grid>
      </Grid>
    </Layout>
  );
};

export default LoginPage;
